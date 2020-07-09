package com.structuralanalisis.structuralanalisis.serializer;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class NodeValueSerializer extends JsonSerializer<Double>{

	@Override
	public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).toString());
	}

}
