# Copyright (c) 2019 LG Electronics, Inc.
# Copyright (c) 2023 Wind River Systems, Inc.

ROS_BUILDTOOL_DEPENDS += " \
    rosidl-parser-native \
    rosidl-adapter-native \
    python3-numpy-native \
    python3-lark-parser-native \
"

# Without the target rosidl-typesupport-{c,cpp}, ament finds the native packages and then fails to link (error: incompatible
# target).
ROS_BUILD_DEPENDS += " \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    rmw-fastrtps-cpp \
    rmw-fastrtps-shared-cpp \
    rmw-implementation \
    rmw-implementation-cmake \
    rosidl-generator-cpp \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
    service-msgs \
"
