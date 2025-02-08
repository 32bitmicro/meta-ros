# Copyright (c) 2024 Wind River Systems, Inc.

# ERROR: QA Issue: non -dev/-dbg/nativesdk- package gz-math-vendor contains symlink .so '/opt/ros/rolling/lib/libgz-math7.so' [dev-so]
inherit ros_insane_dev_so

ROS_BUILD_DEPENDS += "gz-math8"

BBCLASSEXTEND = "native nativesdk"
