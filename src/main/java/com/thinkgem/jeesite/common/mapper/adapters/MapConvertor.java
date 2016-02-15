package com.thinkgem.jeesite.common.mapper.adapters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 此类从未被使用，因查找引用发现仅在 MapAdapter 类中被引用，但 MapAdapter 类从未被使用过。
 *
 * 【@XmlType】JAXB中的基础注释，表示此类可以和对应的xml文件互相转换
 * 【@XmlAccessorType】 表示映射到xml文件的属性类型，XmlAccessType.FIELD 意为Java类中的每
 *    个非静态的（static）、非瞬态的（由@XmlTransient标注）字段
 */
@XmlType(name = "MapConvertor")
@XmlAccessorType(XmlAccessType.FIELD)  
public class MapConvertor {
	
    private List<MapEntry> entries = new ArrayList<MapEntry>();  
  
    public void addEntry(MapEntry entry) {  
        entries.add(entry);  
    }  
  
    public List<MapEntry> getEntries() {  
        return entries;  
    }  
      
    public static class MapEntry {  
  
        private String key;  
  
        private Object value;  
          
        public MapEntry() {  
            super();  
        }  
  
        public MapEntry(Map.Entry<String, Object> entry) {  
            super();  
            this.key = entry.getKey();  
            this.value = entry.getValue();  
        }  
  
        public MapEntry(String key, Object value) {  
            super();  
            this.key = key;  
            this.value = value;  
        }  
  
        public String getKey() {  
            return key;  
        }  
  
        public void setKey(String key) {  
            this.key = key;  
        }  
  
        public Object getValue() {  
            return value;  
        }  
  
        public void setValue(Object value) {  
            this.value = value;  
        }  
    }  
}  