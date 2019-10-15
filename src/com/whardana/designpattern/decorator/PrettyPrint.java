package com.whardana.designpattern.decorator;

import java.util.HashMap;
import java.util.Map;

public class PrettyPrint extends Topping {
    private Map<String, Integer> map;

    public PrettyPrint(Food food) {
        super(food);
        map = new HashMap<>();
    }

    @Override
    public String getDescription() {
        String fullDesc = super.getDescription();
        String[] descs = fullDesc.split(",");
        for (int i = 0; i < descs.length; i++) {
            String desc = descs[i].trim();
            map.put(desc, map.getOrDefault(desc, 0) + 1);
        }

        StringBuffer buffer = new StringBuffer();
        String conjuction = " with";
        int index = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (index == 0) {
                buffer.append(entry.getKey());
            } else {
                buffer.append(conjuction);
                buffer.append(formatCount(entry.getValue()));
                buffer.append(entry.getKey());
                conjuction = " and";
            }
            index++;
        }

        return buffer.toString();
    }

    public String formatCount(int count) {
        switch (count) {
            case 1:
                return " Extra ";
            case 2:
                return " Extra Double ";
            default:
                throw new RuntimeException("Too Much Topping");
        }
    }
}
