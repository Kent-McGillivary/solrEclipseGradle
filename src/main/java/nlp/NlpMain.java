package nlp;


import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

public class NlpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		   SolrClient client = new HttpSolrClient.Builder("http://localhost:8983/solr/my_collection").build();
		    //ContentStreamUpdateRequest req = new ContentStreamUpdateRequest("/update/extract");
		   // req.addFile(new File("my-file.pdf"));
		   // req.setParam(ExtractingParams.EXTRACT_ONLY, "true");
		    //NamedList<Object> result = client.request(req);
		    //System.out.println("Result: " + result);
	}

}
