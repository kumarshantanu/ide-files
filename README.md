# ide-files

A Leiningen template for generating IDE files for existing projects.

## Installation

Latest stable version on Clojars: [0.1.0](https://clojars.org/ide-files/lein-template)

No installation is required if you are using Leiningen 2--templates are
automatically downloaded on first use. Lein 1.x users may need to refer
https://github.com/Raynes/lein-newnew

## Usage

To use the template create (or clone from version control) Leiningen
project followed by creating IDE files.

```bash
$ lein new foo    # or get from version control, or extract downloaded sources
$ cd foo
$ lein new ide-files all     # creates IDE files for both Eclipse and IDEA
$ lein new ide-files eclipse # creates only Eclipse files
$ lein new ide-files idea    # creates only IDEA files
```

## Development

To use the development version of this template, follow the steps below:

```bash
$ git clone https://github.com/kumarshantanu/ide-files.git
$ cd ide-files
$ lein install    # to install locally
```

Use the template as described in *Usage* section.

## Contributors

* Shantanu Kumar
* Michael Klishin

## License

Copyright © 2013 Shantanu Kumar and contributors

Distributed under the Eclipse Public License, the same as Clojure.

## Getting in touch

Via Twitter: [@kumarshantanu](https://twitter.com/kumarshantanu)

Via e-mail: kumar(dot)shantanu at gmail
