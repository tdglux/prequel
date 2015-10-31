package prequelgrailsservice

import com.mongodb.BasicDBObject
import com.mongodb.BulkWriteOperation
import com.mongodb.BulkWriteResult
import com.mongodb.Cursor
import com.mongodb.DB
import com.mongodb.DBCollection
import com.mongodb.DBCursor
import com.mongodb.DBObject
import com.mongodb.MongoClient
import com.mongodb.ParallelScanOptions

class PingController {

    def index() {
    	MongoClient mongoCl = new MongoClient('192.168.1.21', 27017); // or MongoClient('localhost') or MongoClient('localhost', 27017)      
	    DB db = mongoCl.getDB('supplier');

    	render new groovy.json.JsonBuilder(db.getCollection('datasheet').find(new BasicDBObject('name', 'Thai'))).toPrettyString()
    }
}
