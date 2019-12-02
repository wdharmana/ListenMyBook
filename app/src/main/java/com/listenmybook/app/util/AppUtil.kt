package com.listenmybook.app.util

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.renderscript.Element.U8_4
import android.renderscript.ScriptIntrinsicBlur
import android.renderscript.Allocation
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import com.google.android.gms.common.util.IOUtils.toByteArray
import android.renderscript.RenderScript
import android.graphics.drawable.Drawable
import android.renderscript.Element
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream


class AppUtil {

    companion object {

        fun createBlurredImageFromBitmap(
            bitmap: Bitmap,
            context: Context,
            inSampleSize: Int
        ): Drawable {

            val rs = RenderScript.create(context)
            val options = BitmapFactory.Options()
            options.inSampleSize = inSampleSize

            val stream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream)
            val imageInByte = stream.toByteArray()
            val bis = ByteArrayInputStream(imageInByte)
            val blurTemplate = BitmapFactory.decodeStream(bis, null, options)

            val input =
                Allocation.createFromBitmap(rs, blurTemplate)
            val output = Allocation.createTyped(rs, input.getType())
            val script = ScriptIntrinsicBlur.create(
                rs,
                Element.U8_4(rs)
            )
            script.setRadius(8f)
            script.setInput(input)
            script.forEach(output)
            output.copyTo(blurTemplate)

            return BitmapDrawable(context.getResources(), blurTemplate)
        }

    }

}