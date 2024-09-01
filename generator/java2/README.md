# Java Mavlink 2
## Source
This implementation `+ ../mavgen_java2.py` but `- ./tests` was pulled from https://github.com/ArduPilot/pymavlink/pull/341. We should probably merge with master when this pull request goes through, but until that day.... this is our best bet for a Mavlink2 implementation.
## Structure
The most important files / folders in this directory tree are as follows

```
.
├── lib              # These are the header files that the Java2 Mavlink generator pulls from, will be static regardless of schema change.
└── tests            # Tests and test resources are defined here
    └── built-apis   # These are pregenerated java APIs (examples of running mavgen.py for the Java / Java2 options, respectively)              
        ├── lib      # Old (Java mavlink v1) Schema-generated API     
        └── libv2    # New (Java mavlink v2) Schema-generated API
```

## Testing
### Testing Caveats and Words of Caution
1. Tests will be run against previously built versions of the Java Mavlink API (stored at `built-apis`). To change this, you will want to write another makefile task, which targets the Java Mavlink API version you'd like to target.
2. The v1 tests will (purposefully) fail on the parsing of the v2 message. This is because v1 cannot parse v2... as you may expect... 🤓
### Running Tests
Tests may be run by navigating to the `tests` directory, and running:

For Java Mavlink v1: `make clean test` -- for Java Mavlink v1

For Java Mavlink v2: `make clean testv2` -- for Java Mavlink v2

