package com.example.android.miwok;

class Word {




        private String mDefaultTranslation;

        private String mMiwokTranslation;


        private static final int NO_IMAGE_PROVIDED = -1;

        private int imageResource = NO_IMAGE_PROVIDED;





        Word(String DefaultTranslation, String MiwokTranslation){

            mDefaultTranslation = DefaultTranslation;
            mMiwokTranslation = MiwokTranslation;



        }
        Word(String DefaultTranslation, String MiwokTranslation,int imageResourceId){

            mDefaultTranslation = DefaultTranslation;
            mMiwokTranslation = MiwokTranslation;
            imageResource = imageResourceId;

    }



    String getDefaultTranslation(){

            return mDefaultTranslation;
        }

        String getMiwokTranslation(){

            return mMiwokTranslation;
        }

        int getImageResourceId(){


            return imageResource;

        }

        boolean hasImage(){

            return imageResource != NO_IMAGE_PROVIDED;


        }



    }


