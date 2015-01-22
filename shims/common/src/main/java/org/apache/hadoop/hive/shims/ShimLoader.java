/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.shims;

import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge;
import org.apache.hadoop.util.VersionInfo;
import org.apache.log4j.AppenderSkeleton;

/**
 * ShimLoader.
 *
 */
public abstract class ShimLoader {
  private static HadoopShims hadoopShims;
  private static JettyShims jettyShims;
  private static AppenderSkeleton eventCounter;
  private static HadoopThriftAuthBridge hadoopThriftAuthBridge;

  /**
   * The names of the classes for shimming Hadoop for each major version.
   */
  private static final HashMap<String, String> HADOOP_SHIM_CLASSES =
      new HashMap<String, String>();

  static {
    HADOOP_SHIM_CLASSES.put("0.20", "org.apache.hadoop.hive.shims.Hadoop20Shims");
    HADOOP_SHIM_CLASSES.put("0.20S", "org.apache.hadoop.hive.shims.Hadoop20SShims");
    HADOOP_SHIM_CLASSES.put("0.20SUnified", "org.apache.hadoop.hive.shims.Hadoop20SUnifiedShims");
    HADOOP_SHIM_CLASSES.put("0.20SUnifiedSasl", "org.apache.hadoop.hive.shims.Hadoop20SUnifiedShims");
    HADOOP_SHIM_CLASSES.put("0.23", "org.apache.hadoop.hive.shims.Hadoop23Shims");
    HADOOP_SHIM_CLASSES.put("0.25Sasl", "org.apache.hadoop.hive.shims.Hadoop23Shims");
  }

  /**
   * The names of the classes for shimming Jetty for each major version of
   * Hadoop.
   */
  private static final HashMap<String, String> JETTY_SHIM_CLASSES =
      new HashMap<String, String>();

  static {
    JETTY_SHIM_CLASSES.put("0.20", "org.apache.hadoop.hive.shims.Jetty20Shims");
    JETTY_SHIM_CLASSES.put("0.20S", "org.apache.hadoop.hive.shims.Jetty20SShims");
    JETTY_SHIM_CLASSES.put("0.20SUnified", "org.apache.hadoop.hive.shims.Jetty20SShims");
    JETTY_SHIM_CLASSES.put("0.20SUnifiedSasl", "org.apache.hadoop.hive.shims.Jetty20SShims");
    JETTY_SHIM_CLASSES.put("0.23", "org.apache.hadoop.hive.shims.Jetty23Shims");
    JETTY_SHIM_CLASSES.put("0.25Sasl", "org.apache.hadoop.hive.shims.Jetty23Shims");
  }

  /**
   * The names of the classes for shimming Hadoop's event counter
   */
  private static final HashMap<String, String> EVENT_COUNTER_SHIM_CLASSES =
      new HashMap<String, String>();

  static {
    EVENT_COUNTER_SHIM_CLASSES.put("0.20", "org.apache.hadoop.metrics.jvm.EventCounter");
    EVENT_COUNTER_SHIM_CLASSES.put("0.20S", "org.apache.hadoop.log.metrics.EventCounter");
    EVENT_COUNTER_SHIM_CLASSES.put("0.20SUnified", "org.apache.hadoop.log.metrics.EventCounter");
    EVENT_COUNTER_SHIM_CLASSES.put("0.20SUnifiedSasl", "org.apache.hadoop.log.metrics.EventCounter");
    EVENT_COUNTER_SHIM_CLASSES.put("0.23", "org.apache.hadoop.log.metrics.EventCounter");
    EVENT_COUNTER_SHIM_CLASSES.put("0.25Sasl", "org.apache.hadoop.log.metrics.EventCounter");
  }

  /**
   * The names of the classes for shimming {@link HadoopThriftAuthBridge}
   */
  private static final HashMap<String, String> HADOOP_THRIFT_AUTH_BRIDGE_CLASSES =
      new HashMap<String, String>();

  static {
    HADOOP_THRIFT_AUTH_BRIDGE_CLASSES.put("0.20",
        "org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge");
    HADOOP_THRIFT_AUTH_BRIDGE_CLASSES.put("0.20S",
        "org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge20S");
    HADOOP_THRIFT_AUTH_BRIDGE_CLASSES.put("0.20SUnified",
        "org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge23");
    HADOOP_THRIFT_AUTH_BRIDGE_CLASSES.put("0.20SUnifiedSasl",
        "org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge25Sasl");
    HADOOP_THRIFT_AUTH_BRIDGE_CLASSES.put("0.23",
        "org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge23");
    HADOOP_THRIFT_AUTH_BRIDGE_CLASSES.put("0.25Sasl",
        "org.apache.hadoop.hive.thrift.HadoopThriftAuthBridge25Sasl");
  }


  /**
   * Factory method to get an instance of HadoopShims based on the
   * version of Hadoop on the classpath.
   */
  public static synchronized HadoopShims getHadoopShims() {
    if (hadoopShims == null) {
      hadoopShims = loadShims(HADOOP_SHIM_CLASSES, HadoopShims.class);
    }
    return hadoopShims;
  }

  /**
   * Factory method to get an instance of JettyShims based on the version
   * of Hadoop on the classpath.
   */
  public static synchronized JettyShims getJettyShims() {
    if (jettyShims == null) {
      jettyShims = loadShims(JETTY_SHIM_CLASSES, JettyShims.class);
    }
    return jettyShims;
  }

  public static synchronized AppenderSkeleton getEventCounter() {
    if (eventCounter == null) {
    	eventCounter = tryAndLoadShims(AppenderSkeleton.class,
    			          "org.apache.hadoop.metrics.jvm.EventCounter",
    			          "org.apache.hadoop.log.metrics.EventCounter");
    }
    return eventCounter;
  }

  public static synchronized HadoopThriftAuthBridge getHadoopThriftAuthBridge() {
    if (hadoopThriftAuthBridge == null) {
      hadoopThriftAuthBridge = loadShims(HADOOP_THRIFT_AUTH_BRIDGE_CLASSES,
          HadoopThriftAuthBridge.class);
    }
    return hadoopThriftAuthBridge;
  }

  private static <T> T loadShims(Map<String, String> classMap, Class<T> xface) {
    String vers = getMajorVersion();
    String className = classMap.get(vers);
    return createShim(className, xface);
  }
  
  private static <T> T tryAndLoadShims(Class<T> xface, String... classNames) {
	  for (String className : classNames) {
		  try {
	          return createShim(className, xface);
	      } catch (Exception e) {
	      // continue
	      }
	   }
	   throw new RuntimeException("Could not load shims in any of classes " +
		  Arrays.toString(classNames));
	}
    private static <T> T createShim(String className, Class<T> xface) {
    try {
      Class<?> clazz = Class.forName(className);
      return xface.cast(clazz.newInstance());
    } catch (Exception e) {
      throw new RuntimeException("Could not load shims in class " +
          className, e);
    }
  }

  /**
   * Return the "major" version of Hadoop currently on the classpath.
   * For releases in the 0.x series this is simply the first two
   * components of the version, e.g. "0.20" or "0.23". Releases in
   * the 1.x and 2.x series are mapped to the appropriate
   * 0.x release series, e.g. 1.x is mapped to "0.20S" and 2.x
   * is mapped to "0.23".
   */
  public static String getMajorVersion() {
    String vers = VersionInfo.getVersion();

    String[] parts = vers.split("\\.");
    if (parts.length < 2) {
      throw new RuntimeException("Illegal Hadoop Version: " + vers +
          " (expected A.B.* format)");
    }

    // Special handling for Hadoop 1.x and 2.x
    switch (Integer.parseInt(parts[0])) {
    case 0:
      break;
    case 1:
      if (vers.toLowerCase().contains("-mapr")) {
        // Unified Hadoop MR1 APIs have the version as format "1.0.3-mapr-1408" in yarn 4.0.0 and 4.0.1,
        // while in yarn 4.0.2, the version format is changed to "1.0.3-mapr-4.0.2-1501"
        String[] versionParts = vers.toLowerCase().split("-");
        if (versionParts.length < 3) {
          throw new RuntimeException("Illegal Hadoop Version: " + vers +
              " (expected xxx-mapr-xxx format)");
        }
        String coreVersion = versionParts[2];
        if (coreVersion.contains(".")) {
          return "0.20UnifiedSasl";
        } else {
          return "0.20SUnified";
        }
      } else {
        return "0.20S";
      }
    case 2:
      int minor = Integer.parseInt(parts[1]);
      if (minor < 5) {
        return "0.23";
      } else {
        return "0.25Sasl";
      }

    default:
      throw new IllegalArgumentException("Unrecognized Hadoop major version number: " + vers);
    }

    String majorVersion = parts[0] + "." + parts[1];

    // If we are running a security release, we won't have UnixUserGroupInformation
    // (removed by HADOOP-6299 when switching to JAAS for Login)
    try {
      Class.forName("org.apache.hadoop.security.UnixUserGroupInformation");
    } catch (ClassNotFoundException cnf) {
      if ("0.20".equals(majorVersion)) {
        majorVersion += "S";
      }
    }
    return majorVersion;
  }

  private ShimLoader() {
    // prevent instantiation
  }
}
