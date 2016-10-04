package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by brinkman on 10/3/16.
 */
public class test_1 {

    DcMotor LF;
    DcMotor LB;
    DcMotor RF;
    DcMotor RB;
    float LFP;
    float LBP;
    float RFP;
    float RBP;
    @Override
    public void init() {
        LF = hardwareMap.dcMotor.get("LF");
        LB = hardwareMap.dcMotor.get("LB");
        RF = hardwareMap.dcMotor.get("RF");
        RB = hardwareMap.dcMotor.get("RB");

        LF.setDirection(DcMotor.Direction.REVERSE);
        LB.setDirection(DcMotor.Direction.REVERSE);

    }
