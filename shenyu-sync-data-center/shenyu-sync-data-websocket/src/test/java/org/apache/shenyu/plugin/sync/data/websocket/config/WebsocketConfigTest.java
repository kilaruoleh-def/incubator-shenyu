/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.plugin.sync.data.websocket.config;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * add test case for {@link WebsocketConfig}.
 */
public class WebsocketConfigTest {

    private static final String URLS = "ws://localhost:9095/websocket";

    private WebsocketConfig websocketConfig;

    @Before
    public void setUp() {
        websocketConfig = new WebsocketConfig();
        websocketConfig.setUrls(URLS);
    }

    @Test
    public void testGetterSetter() {
        assertEquals(URLS, websocketConfig.getUrls());
    }

    @Test
    public void testEquals() {
        WebsocketConfig that = new WebsocketConfig();
        that.setUrls(URLS);
        assertEquals(websocketConfig, websocketConfig);
        assertEquals(websocketConfig, that);
        assertNotEquals(websocketConfig, null);
        assertNotEquals(websocketConfig, new Object());
    }

    @Test
    public void testHashCode() {
        assertEquals(Objects.hash(websocketConfig.getUrls()), websocketConfig.hashCode());
    }

    @Test
    public void testToString() {
        String[] array = {"WebsocketConfig{urls='", "'}"};
        String expected = String.join(websocketConfig.getUrls(), array);
        assertEquals(expected, websocketConfig.toString());
    }
}
