cmake_minimum_required (VERSION 2.8)
project (hello-library)



set(CMAKE_MODULE_PATH "${CMAKE_SOURCE_DIR}/cmake_modules/")

include(gradle-cpp)
include(gradle-cpp-cppUnitTest)

# read version of the project in the gradle.propersties file
get_property_value(${CMAKE_SOURCE_DIR}/gradle.properties "version" VERSION)
MESSAGE("VERSION = ${VERSION}bb")
SET(PROJECT_NAME "hello-${VERSION}")
SET(PROJECT_STATICNAME "hello_static-${VERSION}")



####################################"
add_library (
    ${PROJECT_STATICNAME}
    STATIC
   ${SOURCES}        
)
####################################"
add_library (
    ${PROJECT_NAME}
    SHARED
    ${SOURCES}
)


# LINK LIBRARIES

target_link_libraries( ${PROJECT_STATICNAME} ${STATIC_LIBRARIES} )
target_link_libraries( ${PROJECT_NAME} ${STATIC_LIBRARIES} )


# Add own output directory to library dir
LIST(APPEND CMAKE_PREFIX_PATH ${CMAKE_LIBRARY_OUTPUT_DIRECTORY})

