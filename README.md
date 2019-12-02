# ListenMyBook

[![Open Source Love](https://badges.frapsoft.com/os/v2/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/) <a href="https://github.com/wdharmana/ListenMyBook/graphs/contributors" alt="Contributors">
        <img src="https://img.shields.io/github/contributors/wdharmana/ListenMyBook" /></a> ![GitHub repo size](https://img.shields.io/github/repo-size/wdharmana/ListenMyBook) ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/wdharmana/ListenMyBook) ![GitHub commit activity](https://img.shields.io/github/commit-activity/m/wdharmana/ListenMyBook)

Let’s imagine you visit Library in your area. You pick one book, choose favorite seat and read the physical book. Boring? Maybe. But it’s a normal step to enjoy book in Library and other place. Why we don’t try to download e-Book or audiobook? Simple. Not all of your favorite book will available on that version.  Have you think about “How we can listen what book we read?”.  That’s why I want to develop ListenMyBook.

ListenMyBook is Android App that give user different experience when reading book using power of Machine Learning.  Every user who using this app will have to take picture of book page and can listen what content of the book. ListenMyBook also give possibility to convert book page content into any language and listen the voice easily. 


<h3>How it works:</h3>
<ul>
  <li>Take Picture of Book Page</li>
<li>If you need to translate, pick target language</li>
<li>Listen the Voice of your content</li>
  </ul>
  
  
## Tell us how you plan on bringing it to life.
#### 1) Any potential sample code you’ve already written
I just work in ListenMyBook project that everyone can monitor here: https://github.com/wdharmana/ListenMyBook. ListenMyBook built with Kotlin language and some platform by Google, such as:
<ul>
<li>MLKit On-Device Text Recognition: I use it to identify text that contained in image of book page</li>
<li>MLKit On-Device Translation: offer user option to translate text from image</li>
<li>Google Cloud Text to Speech: convert text from book or translated text into voice</li>
<li>Firebase Auth: User can login / register with Facebook / Google Account to manage their collection</li>
 <ul>
         
#### 2) a list of the ways you could use Google’s help
<ul>
<li>Mentoring about how to recycle generated voice and available offline without call Google Cloud TTS API frequently</li>
<li>I need help from Google about how we can use Machine Learning to identify and group book page that another also read. I think it will make it efficient to generate the voice. </li>
<li>On development phase, i predict will hit Google Cloud TTS API Frequently. Free Quota for Google Cloud TTS will be help for me :)</li>
<li>Mentoring about how we can monetize Machine Learning App, especially in my case.</li>
        </ul>

#### 3) as well as the timeline on how you plan on bringing it to life by May 1, 2020
Here the development plan for ListenMyBook project:

December, 2019
Design UI/UX for Mobile App
UI/UX Implementation for Mobile App
Third Party / Platform Initial Integration

January, 2020
Pick Picture from Camera
Get Text from Camera with MLKit 
Translate Text into Specific Language with MLKit
Convert Text into Voice with Google Cloud TTS

February, 2020 [until Mid]
Authentication with Google Sign In
Manage Collection
Improve Offline-First Listening

February, 2020 [Mid] - March, 2020
Mentoring session and get feedback from Mentor
Get user feedback with user acceptance test
Release to Public



