package org.LexGrid.LexBIG.caCore.applicationservice;

import java.io.Serializable;

/**
 * Wrapper for sending {@link java.io.InputStream}s to the client, with the expectation that
 * the client will 'unwrap' the byte array and hydrate a new {@link java.io.InputStream}
 * (most likely, a {@link java.io.ByteArrayInputStream}).
 */
public class RemoteInputStreamWrapper implements Serializable {

    private static final long serialVersionUID = 328996422166452085L;

    private byte[] bytes;

    /**
     * This is for serialization/deserialization purposes only.
     */
    public RemoteInputStreamWrapper() {
        super();
    }

    public RemoteInputStreamWrapper(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte[] getBytes() {
        return bytes;
    }
}
