"use client"
import React from "react";
import { useState } from "react"

export default function SendPage(){
    const[file, setFile]= useState<File | null>(null);

    const handleSubmit= async()=>{
    if(!file) return alert("please select a file");

    const formData= new FormData();
    formData.append("file", file);

    await fetch("http://localhost:8080/api/send", {
        method: "POST",
        body: formData
    });
    alert("File sent Successfully!");
  }

  return (
    <div className="bg-gray-500 min-h-screen flex flex-col items-center justify-center">
        <h1 className="text-4xl font-bold mb-4">Send a File</h1>
        <input type="file" 
        onChange={(e) => {
            setFile(e.target.files?.[0] || null)
        }}
        className="mb-4 underline"
        />
        <button 
        onClick={handleSubmit}
        >Send File</button>

    </div>
  );
}