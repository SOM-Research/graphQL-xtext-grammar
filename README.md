# graphQL-xtext-grammar

What is this project about?
---------------------------

GraphQL includes two different sublanguages: query and schema. The former, [specified by Facebook](http://facebook.github.io/graphql/), is intended for the definition of query and mutation requests on the data, which follows the specific schema defined with the latter. 

This project includes two Xtext-based grammars for GraphQL. The grammars are provided in two folders:

* `es.unex.quercusseg.graphqlIDL` includes the grammar for the GraphQL schema language
* `es.unex.quercusseg.graphqlxtext` includes the grammar for the GraphQL query language

The folder `es.uoc.somresearch.graphQL.example` includes a running example  based on the refer-
ence example provided in [GraphQL documentation](http://graphql.org/learn/). The example includes the UML model and the corresponding GraphQL document.


Requirements
---------------------------------

* JRE 1.7 or above
* Eclipse 4.6 or above
* [EMF](https://eclipse.org/modeling/emf/) 3.7 or above
* [Xtext](https://eclipse.org/Xtext/) For the grammar
* [Papyrus](https://eclipse.org/papyrus/) For the running example UML model

Who is behind this project?
---------------------------
* [Roberto Rodríguez-Echevarría](https://github.com/rrecheve)
* [Javier Canovas](http://github.com/jlcanovas/ "Javier Canovas")
* [Jordi Cabot](http://github.com/jcabot/ "Jordi Cabot")

Javier and Jordi are currently members of [SOM](http://som.uoc.es), a research team of IN3-UOC. Roberto is member of the [Quercus SEG](http://quercusseg.unex.es/)
