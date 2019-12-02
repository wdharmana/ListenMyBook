package com.listenmybook.app

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.firebase.ml.vision.FirebaseVision
import com.google.firebase.ml.vision.common.FirebaseVisionImage
import com.google.firebase.ml.vision.text.FirebaseVisionText
import com.listenmybook.app.util.AppUtil
import kotlinx.android.synthetic.main.activity_scan_result.*
import java.io.File
import java.io.IOException

class ScanResultActivity : AppCompatActivity() {

    var bookText: String = ""
    var image: FirebaseVisionImage? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_result)

        supportActionBar?.hide()

        val sampleBitmap = BitmapFactory.decodeResource(getResources(),
            R.drawable.page_sample)

        root_layout.background = AppUtil.createBlurredImageFromBitmap(
            BitmapFactory.decodeResource(getResources(),
                R.drawable.page_sample), this, 12
        )

        analyzeImage(sampleBitmap)

    }

    private fun handleResultText(result: FirebaseVisionText) {

        val resultText = result.text
        for (block in result.textBlocks) {
            val blockText = block.text
            val blockConfidence = block.confidence
            val blockLanguages = block.recognizedLanguages
            val blockCornerPoints = block.cornerPoints
            val blockFrame = block.boundingBox
            for (line in block.lines) {
                val lineText = line.text
                val lineConfidence = line.confidence
                val lineLanguages = line.recognizedLanguages
                val lineCornerPoints = line.cornerPoints
                val lineFrame = line.boundingBox
                for (element in line.elements) {
                    val elementText = element.text
                    val elementConfidence = element.confidence
                    val elementLanguages = element.recognizedLanguages
                    val elementCornerPoints = element.cornerPoints
                    val elementFrame = element.boundingBox
                }
            }
        }

        //tv_content.text = resultText.replace("\n"," ")
        bookText = resultText.replace("\n"," ")


    }

    private fun analyzeImage(bitmap: Bitmap) {

        layout_loader.visibility = View.VISIBLE

        image = FirebaseVisionImage.fromBitmap(bitmap)

        val detector = FirebaseVision.getInstance()
            .onDeviceTextRecognizer

        val result = image?.let {
            detector.processImage(it)
                .addOnSuccessListener { firebaseVisionText ->
                    Log.e("Msg", firebaseVisionText.text)
                    handleResultText(firebaseVisionText)

                    layout_loader.visibility = View.GONE

                }
                .addOnFailureListener { e ->
                    Log.e("Error", e.message.toString())
                    // Task failed with an exception
                    // ...

                    layout_loader.visibility = View.GONE
                }
        }




    }


}
