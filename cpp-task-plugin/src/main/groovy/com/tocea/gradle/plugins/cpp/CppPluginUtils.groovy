package com.tocea.gradle.plugins.cpp

/**
 * Created by jguidoux on 03/09/15.
 */
class CppPluginUtils {

    public static final String ZIP_EXTENSION = "zip"
    public static final String CLIB_EXTENSION = "clib"
    public static final String EXT_LIB_PATH = "build/extLib"
    public static final String COMPILE_CMAKE_BASE_ARG = "compile"
    public static final String TEST_COMPILE_CMAKE_BASE_ARG = "testCompile"
    public static final String TEST_CMAKE_BASE_ARG = "test"
    public  static final Set OUTPUT_DIRS = ["main-obj", "test-obj", "tmp", "report"] as Set
}