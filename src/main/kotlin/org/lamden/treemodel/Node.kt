package org.lamden.treemodel

class Node : AbstractNode() {
    var edges = mapOf<String, AbstractNode>()
    var value : Any? = null

    fun edge(name: String): Node {
        type = NodeType.INNER
        if (!edges.containsKey(name)) {
            val node = Node()
            edges += name to node
            return node
        }
        return edges[name]!! as Node
    }

    fun edges(name: String): NodeCollection {
        type = NodeType.INNER
        if (!edges.containsKey(name)) {
            val node = NodeCollection()
            edges += name to node
            return node
        }
        return edges[name]!! as NodeCollection
    }

}