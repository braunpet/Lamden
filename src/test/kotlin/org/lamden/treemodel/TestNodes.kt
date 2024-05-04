package org.lamden.treemodel

import kotlin.test.Test
import kotlin.test.assertEquals

class TestNodes {

    @Test
    fun testNode() {
        val node = Node()
        node.id = "1"
    }

    @Test
    fun createNodeTree()
    {
        val root = Node()
        root.edge("database").edge("name").value = "DemoDatabase"
        root.edge("database").edge("version").value = 1
        root.edge("database").edge("port").value = 3306
        root.edges("resources")[0].edge("name").edge("name").value = "Person"
        root.edges("resources")[0].edges("attributes")[0].edge("name").value = "firstName"
        root.edges("resources")[0].edges("attributes")[0].edge("type").value = "String"
        root.edges("resources")[0].edges("attributes")[1].edge("name").value = "lastName"
        root.edges("resources")[0].edges("attributes")[1].edge("type").value = "String"
        root.edges("resources")[8].edges("attributes")[0].edge("name").value = "accountNumber"

        assertEquals(2, root.edges("resources")[0].edges("attributes").size())
        assertEquals("accountNumber", root.edges("resources")[8].edges("attributes")[0].edge("name").value)
    }
}