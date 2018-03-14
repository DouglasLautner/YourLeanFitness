package com.leanfitness.leanfitness;

import java.io.Serializable;

/**
 * Created by ndabhi on 3/13/2018.
 */

public class ExerciseInfo implements Serializable{
    private int mImageId; //Id of the image
    private int mImageBg; //Background of the exercise
    private String mName; //Name of the exercise
    private String mSummary;  //Summary of the exercise
    private String mDesc;     //Description of the exercise
    private String mBodyPart; // Which body part it will effect
    private String mVideoUrl; //Video url path of the exercise


    public ExerciseInfo(int imageId, int backgroundId,
                        String name, String summary, String desc,
                        String bodyPart, String videoPath) {
        mImageId  = imageId;
        mImageBg  = backgroundId;
        mName     = name;
        mSummary  = summary;
        mDesc     = desc;
        mBodyPart = bodyPart;
        mVideoUrl = videoPath;
    }

    public int getImage() { return mImageId; }
    public void setImage (int id) { mImageId = id; }

    public int getBackground() { return mImageBg; }
    public void setBackground(int id) { mImageBg = id; }

    public String getName() { return mName; }
    public void setName(String name) { mName = name; }

    public String getSummary() { return mSummary; }
    public void setSummary(String summary) { mSummary = summary; }

    public String getDesc() { return mDesc; }
    public void setDesc(String desc) { mDesc = desc; }

    public String getBodyPart() { return mBodyPart; }
    public void setBodyPart(String part) { mBodyPart = part; }

    public String getVideo() { return mVideoUrl; }
    public void setVideo(String url) { mVideoUrl = url; }
}
