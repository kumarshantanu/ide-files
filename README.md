# ide-files

A Leiningen template for generating IDE files for existing projects.

## Instalation

This template is not on Clojars yet. Please clone this repo and run
`lein install` to install locally. Then depend on

``` clojure
[ide-files/lein-template    "0.1.0-SNAPSHOT"]
```

in your `~/.lein/profiles.clj`.

## Usage

Create Leiningen project followed by creating IDE files.

```bash
$ lein new foo
$ cd foo
$ lein new ide-files all     # creates IDE files for both Eclipse and IDEA
$ lein new ide-files eclipse # creates only Eclipse files
$ lein new ide-files idea    # creates only IDEA files
```

## Getting in touch

Via Twitter: [@kumarshantanu](https://twitter.com/kumarshantanu)

Via e-mail: kumar(dot)shantanu at gmail

## License

Copyright © 2013 Shantanu Kumar

Distributed under the Eclipse Public License, the same as Clojure.
