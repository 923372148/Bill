package com.gzcc.kindmanager.Service;

import com.gzcc.kindmanager.domain.Kind;
import org.bson.types.ObjectId;

public interface KindService {
boolean addKind(String kindName);
   Kind findKindBykindId(ObjectId kindId);
}
