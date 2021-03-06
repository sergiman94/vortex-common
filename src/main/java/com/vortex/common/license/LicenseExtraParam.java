
package com.vortex.common.license;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LicenseExtraParam {

    public static final int NO_LIMIT = -1;

    @JsonProperty("id")
    private String id;

    @JsonProperty("version")
    private String version;

    @JsonProperty("graphs")
    private int graphs;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("mac")
    private String mac;

    @JsonProperty("cpus")
    private int cpus;

    // The unit is MB
    @JsonProperty("ram")
    private int ram;

    @JsonProperty("threads")
    private int threads;

    // The unit is MB
    @JsonProperty("memory")
    private int memory;

    @JsonProperty("nodes")
    private int nodes;

    // The unit is MB
    @JsonProperty("data_size")
    private long dataSize;

    @JsonProperty("vertices")
    private long vertices;

    @JsonProperty("edges")
    private long edges;

    public String id() {
        return this.id;
    }

    public String version() {
        return this.version;
    }

    public int graphs() {
        return this.graphs;
    }

    public String ip() {
        return this.ip;
    }

    public String mac() {
        return this.mac;
    }

    public int cpus() {
        return this.cpus;
    }

    public int ram() {
        return this.ram;
    }

    public int threads() {
        return this.threads;
    }

    public int memory() {
        return this.memory;
    }

    public int nodes() {
        return this.nodes;
    }

    public long dataSize() {
        return this.dataSize;
    }

    public long vertices() {
        return this.vertices;
    }

    public long edges() {
        return this.edges;
    }
}
