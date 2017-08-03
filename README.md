# SBT multi level project (with independent sub-module build)
[![Build Status](https://travis-ci.org/hugemane/sbt-multi-independent-project.svg?branch=master)](https://travis-ci.org/hugemane/sbt-multi-independent-project)

It would be nice to have one's cake and eat it.

## Motivation
1. Build project at top most hierarchy level.
2. Have DRY 'top' level references e.g. Dependencies, Versions, etc.
3. Build project only at sub-module level (independently).

Building from the top is simple and easy, `dependsOn` works and all sub-modules compile depending... all the code in one place, its all nice and good.

However, if you really just want to focus on the sub-module project, you're in and out - that would be terrific.

Think large project, with lots of sub-modules, could be an API, utility or micro services, whatever.
The ability to make cheap up-stream *project* changes is great, when checking out at the 'top' most project level. Any change can ripple down and fixes be made at any sub-module that depends on the dependent changed module (up/down).

At the sub-module level, it's probable that this would be deployed independently. When a new feature is needed, check out only what's needed at the sub-module(s) level (possible with [git sparse checkout](https://git-scm.com/docs/git-read-tree#_sparse_checkout)). Implement, Build, Deploy and Done - but rely on existing pre-released 'stable' dependent modules.
 
## Building/Testing Strategy
1. Should be able to build at 'bleeding' edge for whole project and test this at the 'top' level.
2. Should be able to build at the individual sub-module level with 'stable' pre-released dependencies.
3. For #1 and #2 these should make use of the same DRY references to dependencies (employ sbt build library `/project` dir).
4. Versions on sub-modules can differ, don't need to have whole project 'top to bottom' have a version change.
5. With more funky situations i.e. features or dependency versions (already in the wild), existing scm branching can be employed.
