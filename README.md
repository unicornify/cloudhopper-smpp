Cloudhopper SMPP by Fizzed (forked from Twitter)
================================================

[![](https://jitpack.io/v/unicornify/cloudhopper-smpp.svg)](https://jitpack.io/#unicornify/cloudhopper-smpp)

News
------------------------

**Mar 2021**

While Restcomm took over from Fizzed a while ago, there is now an apparent lack of commits on the original repository for more than a year.
The project was forked here and was updated as it is being used in our projects.

**Nov 2016**

While Fizzed, Inc. took over from Twitter for a while, there is now an apparent lack of commits on the original repository for almost a year and PR pending reviews for more than 6 months.
The project was forked here and will be updated regularly as it is being used in Restcomm SMSC


**Nov 2015**

While Twitter still relies exclusively on `ch-smpp` for its global SMS
infrastructure, Twitter stopped supporting this opensource project as of
October 2015.  Fizzed, Inc. was the only company maintaining it, so any new
support & development will occur here in its new home.

Overview
------------------------

Efficient, scalable, rock-solid, and flexible Java implementation of the Short
Messaging Peer to Peer Protocol (SMPP).

 * Real-world used library by Twitter across nearly every SMSC vendor and
   mobile operator around the world.  We've seen almost every variance in the
   SMPP protocol and this library handles it flawlessly.
 * Rigorous unit testing
 * Support for SMPP protocol:
    * Version 3.3
    * Version 3.4
    * Most of version 5.0
 * Uses non-blocking (NIO) sockets (via underlying Netty dependency, one thread
   can support 1 or more SMPP sessions)
 * Can support thousands of binds/connections using minimal resources and threads
 * Supports both client and server modes of the SMPP protocol (yes you can
   write your own SMPP server using this library as well as be a client to one)
 * Supports synchronous request mode (send request and block until response
   received)
 * Supports asynchronous request mode (send request, get a future response,
   and then decide when you'd like to wait/get a response)
 * Advanced support for SMPP "windowing":
    * Configurable window size per session
    * Waiting for a window slot to open up
    * Get a list of unacknowledged/in-flight PDUs if session disconnects
 * SSL/TLS support for clients and servers
 * Configurable support for expiry of unacknowledged PDUs
 * Configurable counter metrics per client-session, server-session, or server.
 * Support for sniffing/logging/discarding of PDUs before normal processing

The library has been tested and certified with hundreds of mobile operators
and suppliers around the world.  It's effective at being flexible with SMPP
specifications that aren't truly compliant.


Background and Contributors
---------------------------

This library was originally developed by Cloudhopper, Inc. in 2008. Cloudhopper
was acquired by Twitter in April 2010. The main author of this library,
Joe Lauer, left Twitter in April 2013 to found Fizzed, Inc.  As of Nov 2015,
[Fizzed, Inc](http://fizzed.com) is the official maintainer of the library.
If you're looking for commercial support, please contact [Fizzed](http://fizzed.com).

- Joe Lauer (Twitter: [@jjlauer](http://twitter.com/jjlauer))
- Garth (Twitter: [@trg](http://twitter.com/trg))

Installation
------------

Library is available via jitpack, add the JitPack repository to your maven pom.xml

    <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
      </repository>
    </repositories>

Add the dependency

    <dependency>
      <groupId>com.github.unicornify</groupId>
      <artifactId>cloudhopper-smpp</artifactId>
      <version>version-6.0.0-netty4-beta-4</version>
    </dependency>

Demo Code / Tutorials
---------------------

There are numerous examples of how to use various parts of this library:

    src/test/java/com/cloudhopper/smpp/demo/

User Contributed Demos
----------------------

A more complete persistent client demo:

(https://github.com/krasa/cloudhopper-smpp/tree/persistent-connection/src/test/java/com/cloudhopper/smpp/demo/persist)

A tutorial in Russian:

https://github.com/wizardjedi/my-spring-learning/wiki/Twitter-cloudhopper

Please let us know if you have other tutorials worth mentioning!


License
-------

Copyright (C) 2015+ Fizzed, Inc.
Copyright (C) 2009-2015 Twitter, Inc.
Copyright (C) 2008-2009 Cloudhopper, Inc.

This work is licensed under the Apache License, Version 2.0. See LICENSE for details.
