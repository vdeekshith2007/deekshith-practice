// contact of jsx as the extended frame work of java script.

// jsx react .jsx


// contact info uisng jsx 
import React from "react";
import "contact.css";
function contact(){
    return (
        <div className="contact-container">
            <p>deekshith is good </p>

            <form className="contact-form">
                <label>name</label>
                <input type="text" placeholder="enter"
                required
                />
                <label>phone</label>
                <input type ="tel"
                placeholder="enter"
                />
                <label>email message</label>
            <textarea rows="5"
            placeholer="enter your gmail message"
            required
            ></textarea>
            <button type="submit">send your gmail</button>
            
            </form>

        </div>
    );
}



export default contact;
