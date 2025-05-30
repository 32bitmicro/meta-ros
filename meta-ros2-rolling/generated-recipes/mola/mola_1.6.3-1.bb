# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Metapackage with all core open-sourced MOLA packages."
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c1feec27682903a4270dbb401e443f91"

ROS_CN = "mola"
ROS_BPN = "mola"

ROS_BUILD_DEPENDS = " \
    kitti-metrics-eval \
    mola-bridge-ros2 \
    mola-demos \
    mola-input-euroc-dataset \
    mola-input-kitti-dataset \
    mola-input-kitti360-dataset \
    mola-input-mulran-dataset \
    mola-input-paris-luco-dataset \
    mola-input-rawlog \
    mola-input-rosbag2 \
    mola-kernel \
    mola-launcher \
    mola-metric-maps \
    mola-pose-list \
    mola-relocalization \
    mola-traj-tools \
    mola-viz \
    mola-yaml \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    kitti-metrics-eval \
    mola-bridge-ros2 \
    mola-demos \
    mola-input-euroc-dataset \
    mola-input-kitti-dataset \
    mola-input-kitti360-dataset \
    mola-input-mulran-dataset \
    mola-input-paris-luco-dataset \
    mola-input-rawlog \
    mola-input-rosbag2 \
    mola-kernel \
    mola-launcher \
    mola-metric-maps \
    mola-pose-list \
    mola-relocalization \
    mola-traj-tools \
    mola-viz \
    mola-yaml \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    kitti-metrics-eval \
    mola-bridge-ros2 \
    mola-demos \
    mola-input-euroc-dataset \
    mola-input-kitti-dataset \
    mola-input-kitti360-dataset \
    mola-input-mulran-dataset \
    mola-input-paris-luco-dataset \
    mola-input-rawlog \
    mola-input-rosbag2 \
    mola-kernel \
    mola-launcher \
    mola-metric-maps \
    mola-pose-list \
    mola-relocalization \
    mola-traj-tools \
    mola-viz \
    mola-yaml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-xmllint \
    ament-lint-auto \
    ament-lint-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mola-release/archive/release/rolling/mola/1.6.3-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/mola"
SRC_URI = "git://github.com/ros2-gbp/mola-release;${ROS_BRANCH};protocol=https"
SRCREV = "24dc7be1f53a02d34a49037b7a2495da151af1a5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
