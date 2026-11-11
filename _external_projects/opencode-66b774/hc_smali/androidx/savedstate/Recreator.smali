.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation


# instance fields
.field public final げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/savedstate/Recreator;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 6

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_CREATE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, v0, :cond_c2

    invoke-interface {p1}, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;

    move-result-object p1

    check-cast p1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    iget-object p1, p1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {p1, p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object p1, p0, Landroidx/savedstate/Recreator;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;

    invoke-interface {p1}, Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;->なぎぱいぢぎ()Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    move-result-object p1

    const-string p2, "androidx.savedstate.Restarter"

    .line 3
    iget-boolean v0, p1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_ba

    iget-object v0, p1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_34

    invoke-virtual {v0, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v2, p1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Landroid/os/Bundle;

    invoke-virtual {v2, p2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object p2, p1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Landroid/os/Bundle;

    invoke-virtual {p2}, Landroid/os/Bundle;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_33

    iput-object v1, p1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Landroid/os/Bundle;

    :cond_33
    move-object v1, v0

    :cond_34
    if-nez v1, :cond_37

    return-void

    :cond_37
    const-string p1, "classes_to_restore"

    .line 4
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_b2

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_43
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 5
    :try_start_4f
    const-class v0, Landroidx/savedstate/Recreator;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-class v2, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0
    :try_end_60
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4f .. :try_end_60} :catch_a2

    :try_start_60
    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_66
    .catch Ljava/lang/NoSuchMethodException; {:try_start_60 .. :try_end_66} :catch_85

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    :try_start_6a
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;
    :try_end_72
    .catch Ljava/lang/Exception; {:try_start_6a .. :try_end_72} :catch_78

    iget-object p2, p0, Landroidx/savedstate/Recreator;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;

    invoke-interface {v0, p2}, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;)V

    goto :goto_43

    :catch_78
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to instantiate "

    invoke-static {v1, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_85
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v1, "Class"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_a2
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Class "

    const-string v2, " wasn\'t found"

    invoke-static {v1, p2, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_b1
    return-void

    .line 6
    :cond_b2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_ba
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_c2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Next event must be ON_CREATE"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    goto :goto_cb

    :goto_ca
    throw p1

    :goto_cb
    goto :goto_ca
.end method
