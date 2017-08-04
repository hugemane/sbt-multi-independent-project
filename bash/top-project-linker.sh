#!/bin/bash
#
# sym link/unlink 'top' project to sub-module when independent mode needed
# could be a good idea alias this script as 'sbt-tpl'

RED='\033[1;31m'
YELLOW='\033[1;33m'

function do_files_exist {
    arg=("$@")
    for file in $@; do
        local projectFilePath="././../project/$file"
        if [ ! -f $projectFilePath ]; then
            echo -e "${RED}Error: $file file does not exist - check 'top' module project directory"
            exit 1
        fi
    done
}

function remove_module_project_sym_links {
    arg=("$@")
    for file in $@; do
        local symLinkProjectFilePath="./project/$file"
        if [ -h $symLinkProjectFilePath ]; then
            unlink $symLinkProjectFilePath
        fi
    done
}

function create_module_project_sym_links {
    arg=("$@")
    for file in $@; do
        local topRelativeProjectPath="../../project/$file"
        ln -s $topRelativeProjectPath "./project/"
    done
}

echo -e "${YELLOW}sbt-tpl (top project linker) running"

TOP_PROJECT_FILES="
Common.scala
Dependencies.scala
"
IFS=$'\n'

do_files_exist $TOP_PROJECT_FILES
remove_module_project_sym_links $TOP_PROJECT_FILES
create_module_project_sym_links $TOP_PROJECT_FILES

sbt -Dindependent=true
wait

remove_module_project_sym_links $TOP_PROJECT_FILES

echo -e "${YELLOW}sbt-tpl (top project linker) complete"

