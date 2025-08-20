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
    <div className="">

    </div>
  );
}