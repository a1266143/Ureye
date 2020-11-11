package com.pqy.baselibrary.util;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;

/**
 * 相机工具类
 * created by xiaojun at 2020/11/10
 */
public class CameraUtils {

    private static CameraUtils sCameraUtils = new CameraUtils();

    private CameraUtils(){

    }

    public static CameraUtils getInstance(){
        return sCameraUtils;
    }

    private CameraManager mCameraManager;

    /**
     * 使用此工具类时需要先初始化
     * @param context
     */
    public void init(Context context){
        mCameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
    }

    /**
     * 每个id代表了一个摄像头
     * 获取摄像头列表
     * @return
     */
    public String[] getCameraIdList() throws CameraAccessException {
            return mCameraManager.getCameraIdList();
    }

    /**
     * 根据cameraId(代表相机)获取对应的功能描述信息
     * @param cameraId 相机Id
     * @return 返回当前cameraId代表的相机的功能描述信息
     * @throws CameraAccessException
     */
    public CameraCharacteristics getCameraCharacteristics(String cameraId) throws CameraAccessException {
        return mCameraManager.getCameraCharacteristics(cameraId);
    }

}
