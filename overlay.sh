#!/bin/bash

# overlay.sh
# This script copies all local files to a working copy of our Vireo source.
#
# The idea is to have in the local directory all files which are different from the TDL
# code. We copy the files in our clone of the  Vireo repository into our WORK_DIR
# and check out the appropriate branch. Then we make adjustments in this project,
# and overlay these adjustments to the working copy of the Vireo code

LOCAL_DIR = /opt/vireo/repos/vireo4local/
WORK_DIR = /opt/vireo/work/v4.2.6/Vireo/

# Copy the updated files into our working project
cp ${LOCAL_DIR}/.env ${WORK_DIR}
cp ${LOCAL_DIR}/src/main/resources/* ${WORK_DIR}/src/main/resources