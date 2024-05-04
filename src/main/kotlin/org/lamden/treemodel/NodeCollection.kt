package org.lamden.treemodel

class NodeCollection : AbstractNode(NodeType.INNER) {
    var nodes = listOf<Node>()

    fun size(): Int {
        return nodes.size
    }

    operator fun get(i: Int): Node {
        if( i >= nodes.size ) {
            for( j in nodes.size..i ) {
                nodes += Node()
            }
        }
        return nodes[i]
    }
}