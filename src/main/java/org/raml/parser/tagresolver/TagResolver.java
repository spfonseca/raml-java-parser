/*
 * Copyright 2013 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.parser.tagresolver;

import org.raml.parser.loader.ResourceLoader;
import org.raml.parser.visitor.NodeHandler;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.Tag;

public interface TagResolver
{

    boolean handles(Tag tag);

    Node resolve(Node valueNode, ResourceLoader resourceLoader, NodeHandler nodeHandler);

    void beforeProcessingResolvedNode(Tag tag, Node originalNode, Node resolvedNode);

    void afterProcessingResolvedNode(Tag tag, Node originalNode, Node resolvedNode);

}
