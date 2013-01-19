# ide-files

A Leiningen template for generating IDE files for existing projects.

## Installation

This template is not on Clojars yet. Please install the template first as follows:

```bash
$ git clone https://github.com/kumarshantanu/ide-files.git
$ cd ide-files
$ lein install    # to install locally
```

## Usage

Now, to use the template create (or clone from version control) Leiningen
project followed by creating IDE files.

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

## Contributors

* Shantanu Kumar
* Michael Klishin

## License

Copyright © 2013 Shantanu Kumar and contributors

Distributed under the Eclipse Public License, the same as Clojure.
