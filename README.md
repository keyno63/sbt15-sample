# sbt15-sample

[![Build](https://github.com/keyno63/sbt15-sample/actions/workflows/build.yaml/badge.svg)](https://github.com/keyno63/sbt15-sample/actions/workflows/build.yaml)

sbt-1.5 の試しをしたかった  
ついでに scala3 で書けないかテスト  

## Usage
### set up

Use version below.
- Java11+
- Scala3

### build

```shell
sbt compile
```

### test

```shell
sbt test
```

### format

format code, sbt files by using scalafmt.

```shell
sbt "all scalafmtSbt scalafmt test:scalafmt"
```

## LICENSE

This repository is MIT License.  
see [License](./LICENSE) file.
