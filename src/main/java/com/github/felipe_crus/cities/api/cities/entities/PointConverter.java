package com.github.felipe_crus.cities.api.cities.entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.data.geo.Point;

@Converter(autoApply = false)
public class PointConverter implements AttributeConverter<Point, String> {

    @Override
    public String convertToDatabaseColumn(Point point) {
        if (point == null) return null;
        return "(" + point.getX() + "," + point.getY() + ")";
    }

    @Override
    public Point convertToEntityAttribute(String value) {
        if (value == null) return null;

        // Remove parênteses da string "(lat,lon)"
        String cleaned = value.replace("(", "").replace(")", "");
        String[] parts = cleaned.split(",");

        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);

        return new Point(x, y);
    }
}