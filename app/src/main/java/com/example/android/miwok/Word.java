package com.example.android.miwok;

class Word {



        private String mDefaultTranslation;

        private String mMiwokTranslation;

        Word(String DefaultTranslation, String MiwokTranslation){

            mDefaultTranslation = DefaultTranslation;
            mMiwokTranslation = MiwokTranslation;


        }

        String getDefaultTranslation(){

            return mDefaultTranslation;
        }

        String getMiwokTranslation(){

            return mMiwokTranslation;
        }





    }


