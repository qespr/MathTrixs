# MathTrixs

<div align="center">
    <img src="resources/Trixie.png"/>
</div>

Free software for Great And Powerful generation of Mathematical examples with solutions. Currently mainly focused on Matrix
operations.

## Project Goals

This project has several goals:

- Simplicity above everything:
  - Performance is not a concern unless it's real bad
  - Most straight-forward implementation possible
  - The point is not to be able to compute huge amount of huge numbers as quickly as possible but to help humans practice, ideally
    be able to guide them step by step
- Portability - We want to work in:
  - JVM
  - Web - ClojureScript
  - .NET (Clojure CLR)
- Ability to export Examples in multiple formats (LaTeX, edn, txt)
- Allow for calculation of examples created outside of this Software (Imported from edn, LaTeX, custom simple text format)
- Support more example types than Matrices

## Why

I couldn't find any Free software for generating Math examples and their solutions beyond super basic stuff (maybe I'm just
blind). Also I learn Math best by implementing it programatically and I need to learn Matrices.

## License

Licensed under [GNU Affero general public license](https://www.gnu.org/licenses/agpl-3.0.en.html)
