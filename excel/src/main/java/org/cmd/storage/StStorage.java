package org.cmd.storage;

import org.cmd.model.ReadSt;
import org.cmd.model.WriteSt;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wu.Chunyang
 */
public class StStorage {
    private static List<ReadSt> data = new ArrayList<>();


    public static void add(ReadSt readSt) {
        data.add(readSt);
    }

    public static List<ReadSt> queryAll() {
        return data;
    }
}
