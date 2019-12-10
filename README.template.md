Advent of Code
==============

Solutions for the [Advent of Code](http://adventofcode.com) programming puzzles by [hsz](https://hsz.mobi).

Below there is a quick list of all available solutions:

| Year | Day | Name | Solution |
|:----:|:---:| ---- |:--------:|\
<% list.each { %>
| ${it.group} | ${it.day} | [${it.title}](http://adventofcode.com/${it.year}/day/${it.day.toInteger()}) | [:star:](./src/main/kotlin/mobi/hsz/adventofcode/aoc${it.year}/Day${it.day}.kt) |\
<% } %>

Readme generated on ${new Date()}
