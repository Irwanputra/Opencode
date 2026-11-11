.class public Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;
.super Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;,
        Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

.field public final げつ〴ぬぐ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/は〲ぱなで;)V
    .registers 7

    invoke-direct {p0}, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    .line 1
    sget-object p1, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/ぉざぅち〻;

    const-class v0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_48

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-static {v2, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p2, Lづざかべべ/のぷのちつ/は〲ぱなで;->げつ〴ぬぐ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/のぷのちつ/ぇぬぎばつ;

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    goto :goto_43

    :cond_24
    instance-of v2, p1, Lづざかべべ/のぷのちつ/ざとぅぼこ〺;

    if-eqz v2, :cond_2f

    check-cast p1, Lづざかべべ/のぷのちつ/ざとぅぼこ〺;

    invoke-virtual {p1, v1, v0}, Lづざかべべ/のぷのちつ/ざとぅぼこ〺;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Class;)Lづざかべべ/のぷのちつ/ぇぬぎばつ;

    move-result-object p1

    goto :goto_35

    :cond_2f
    check-cast p1, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p1, v0}, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/Class;)Lづざかべべ/のぷのちつ/ぇぬぎばつ;

    move-result-object p1

    :goto_35
    move-object v2, p1

    .line 5
    iget-object p1, p2, Lづざかべべ/のぷのちつ/は〲ぱなで;->げつ〴ぬぐ:Ljava/util/HashMap;

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/のぷのちつ/ぇぬぎばつ;

    if-eqz p1, :cond_43

    invoke-virtual {p1}, Lづざかべべ/のぷのちつ/ぇぬぎばつ;->げつ〴ぬぐ()V

    .line 6
    :cond_43
    :goto_43
    check-cast v2, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    .line 7
    iput-object v2, p0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    return-void

    .line 8
    :cond_48
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    invoke-static {v1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->なぎぱいぢぎ(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p2, p0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    .line 1
    iget-object p4, p2, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {p4}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result p4

    if-lez p4, :cond_72

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Loaders:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "    "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iget-object v0, p2, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result v0

    if-gtz v0, :cond_2c

    goto :goto_72

    :cond_2c
    iget-object v0, p2, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/づざかべべ/ぺぁあねじ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/づざかべべ/ぺぁあねじ;->いいにぽつ(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, p2, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {p1, v1}, Lづざかべべ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ(I)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mId="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, " mArgs="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mLoader="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    throw p1

    :cond_72
    :goto_72
    return-void
.end method
