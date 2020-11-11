package com.pqy.ureye;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.pqy.baselibrary.activity.BaseActivity;
import com.pqy.baselibrary.util.CameraUtils;
import com.pqy.baselibrary.util.ToastUtils;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv)
    TextView mTv;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void doOnCreate(Bundle savedInstanceState) {
        try {
            mTv.setText("可操作的相机个数:"+CameraUtils.getInstance().getCameraIdList().length+",\nid="+CameraUtils.getInstance().getCameraIdList()[0]+",\nid="+CameraUtils.getInstance().getCameraIdList()[1]);
            CameraCharacteristics cameraCharacteristics0 = CameraUtils.getInstance().getCameraCharacteristics(CameraUtils.getInstance().getCameraIdList()[0]);
            Integer id = cameraCharacteristics0.get(CameraCharacteristics.LENS_FACING);
            if (id == CameraMetadata.LENS_FACING_BACK){
                mTv.setText("第0个摄像头是后置摄像头");
            }else if (id == CameraMetadata.LENS_FACING_FRONT){
                mTv.setText("第0个摄像头是前置摄像头");
            }

            CameraCharacteristics cameraCharacteristics1 = CameraUtils.getInstance().getCameraCharacteristics(CameraUtils.getInstance().getCameraIdList()[1]);
            Integer id1 = cameraCharacteristics1.get(CameraCharacteristics.LENS_FACING);
            if (id1 == CameraMetadata.LENS_FACING_BACK){
                ToastUtils.show("第1个摄像头是后置摄像头");
            }else{
                ToastUtils.show("第1个摄像头是前置摄像头");
            }
        } catch (CameraAccessException e) {
            ToastUtils.show("获取相机个数失败:"+e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
