package com.sainttx.holograms.nms.v1_12_R1;

import net.minecraft.server.v1_12_R1.AxisAlignedBB;
import net.minecraft.server.v1_12_R1.Vec3D;

public class NullBoundingBox extends AxisAlignedBB {

    public NullBoundingBox() {
        super(0, 0, 0, 0, 0, 0);
    }

    @Override
    public AxisAlignedBB e(double var1) {
        return this;
    }

    @Override
    public AxisAlignedBB a(double arg0, double arg1, double arg2) {
        return this;
    }

    @Override
    public AxisAlignedBB b(double arg0, double arg1, double arg2) {
        return this;
    }

    @Override
    public AxisAlignedBB grow(double arg0, double arg1, double arg2) {
        return this;
    }

    @Override
    public AxisAlignedBB g(double var1) {
        return this;
    }

    @Override
    public AxisAlignedBB a(AxisAlignedBB arg0) {
        return this;
    }

    @Override
    public AxisAlignedBB b(AxisAlignedBB arg0) {
        return this;
    }

    @Override
    public double a(AxisAlignedBB arg0, double arg1) {
        return 0.0;
    }

    @Override
    public boolean b(Vec3D arg0) {
        return false;
    }

    @Override
    public double a() {
        return 0.0;
    }

    @Override
    public double b(AxisAlignedBB arg0, double arg1) {
        return 0.0;
    }

    @Override
    public double c(AxisAlignedBB arg0, double arg1) {
        return 0.0;
    }

    @Override
    public AxisAlignedBB shrink(double arg0) {
        return this;
    }
}