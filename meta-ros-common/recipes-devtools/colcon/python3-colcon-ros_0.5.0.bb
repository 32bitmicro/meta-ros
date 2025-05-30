
SUMMARY = "Extension for colcon to support ROS packages."
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://setup.cfg;beginline=22;endline=22;md5=3d0bd1ac53c1dd582844ed15eee7f8e2"

SRC_URI[sha256sum] = "79a7e89f6fa636f7e4fd44a88b7860fb1da99d51f0ba7bcf0b9b624a1a578365"

inherit pypi setuptools3

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-catkin-pkg \
    ${PYTHON_PN}-colcon-cmake \
    ${PYTHON_PN}-colcon-core \
    ${PYTHON_PN}-colcon-pkg-config \
    ${PYTHON_PN}-colcon-python-setup-py \
    ${PYTHON_PN}-colcon-recursive-crawl \
"

BBCLASSEXTEND += "nativesdk"
