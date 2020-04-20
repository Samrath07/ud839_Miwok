package com.example.android.miwok;

import android.media.MediaPlayer;

class Word {




        private String mDefaultTranslation;

        private String mMiwokTranslation;

        private int audioResourceId;


        private static final int NO_IMAGE_PROVIDED = -1;

        private int imageResource = NO_IMAGE_PROVIDED;





        Word(String DefaultTranslation, String MiwokTranslation ,int audioResource){

            mDefaultTranslation = DefaultTranslation;
            mMiwokTranslation = MiwokTranslation;
            audioResourceId = audioResource;



        }
        Word(String DefaultTranslation, String MiwokTranslation,int imageResourceId, int audioResource){

            mDefaultTranslation = DefaultTranslation;
            mMiwokTranslation = MiwokTranslation;
            imageResource = imageResourceId;
            audioResourceId = audioResource;


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

        int getAudioResourceId(){

            return audioResourceId;
        }

    }


