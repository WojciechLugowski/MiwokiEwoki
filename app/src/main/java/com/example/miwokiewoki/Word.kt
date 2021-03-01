package com.example.miwokiewoki

class Word(private var defaultTranslation : String, private var miwokTranslation : String, private var imageResourceId: Int? = null) {
    public fun getMiwokWord() : String{
        return miwokTranslation
    }
    public fun getDefaultTranslation() : String{
        return defaultTranslation
    }
    public fun getImageResourceId() : Int?{
        return imageResourceId
    }
}