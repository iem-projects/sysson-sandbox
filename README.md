# SysSon Sandbox

Using the SysSon project as a library, this sandbox project allows to get quickly started with reading and processing NetCDF files and talking to SuperCollider or ChucK via OSC.

## Getting started

Opening a console:

    $ sbt console

This will start an interpreter with all relevant libraries in scope.

E.g. opening and running in ChucK an [example patch](http://chuck.cs.princeton.edu/doc/examples/osc/OSC_recv.ck), the following triggers a sound via OSC:

    send("/sndbuf/buf/rate", 2.0)

## Background

The projects links to a particular version of the SysSon source project on GitHub (currently tag v0.2.0). sbt automatically clones and builds the SysSon project when running the sandbox for the first time. Successive builds should be fast.
