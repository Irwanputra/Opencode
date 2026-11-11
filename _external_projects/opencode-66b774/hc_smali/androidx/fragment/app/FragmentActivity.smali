.class public Landroidx/fragment/app/FragmentActivity;
.super Landroidx/activity/ComponentActivity;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$〺つふすそ;
.implements Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

.field public final ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

.field public いいにぽつ:Z

.field public おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u307a\u3041\u3042\u306d\u3058<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public てぜきぽく:Z

.field public のぷのちつ:Z

.field public へぬ〴づぞ:I

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:Z


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentActivity$げつ〴ぬぐ;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 1
    new-instance v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    const-string v2, "callbacks == null"

    invoke-static {v0, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺぁあねじ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;)V

    .line 2
    iput-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    new-instance v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    invoke-direct {v0, p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;-><init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V

    iput-object v0, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->ぺふねづ〺:Z

    return-void
.end method

.method public static 〻ぞまぎな〻(I)V
    .registers 2

    const/high16 v0, -0x10000

    and-int/2addr p0, v0

    if-nez p0, :cond_6

    return-void

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only use lower 16 bits for requestCode"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ぇ〳〲〺すっ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Z
    .registers 7

    check-cast p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    goto :goto_1b

    :cond_f
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_12
    iget-object p0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    monitor-exit v0
    :try_end_1b
    .catchall {:try_start_12 .. :try_end_1b} :catchall_5f

    .line 2
    :goto_1b
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_21
    :goto_21
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-nez v2, :cond_30

    goto :goto_21

    .line 3
    :cond_30
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->ち〴みぎ〻び:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 4
    iget-object v3, v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 5
    sget-object v4, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 6
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    const/4 v4, 0x1

    if-ltz v3, :cond_3f

    const/4 v3, 0x1

    goto :goto_40

    :cond_3f
    const/4 v3, 0x0

    :goto_40
    if-eqz v3, :cond_48

    .line 7
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->ち〴みぎ〻び:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 8
    invoke-virtual {v1, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    const/4 v1, 0x1

    .line 9
    :cond_48
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-nez v3, :cond_4e

    const/4 v3, 0x0

    goto :goto_52

    :cond_4e
    invoke-virtual {v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->〳ぜぞぜべっ()Ljava/lang/Object;

    move-result-object v3

    :goto_52
    if-eqz v3, :cond_21

    .line 10
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->ぺぁあねじ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v2

    invoke-static {v2, p1}, Landroidx/fragment/app/FragmentActivity;->ぇ〳〲〺すっ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Z

    move-result v2

    or-int/2addr v1, v2

    goto :goto_21

    :cond_5e
    return v1

    :catchall_5f
    move-exception p0

    .line 11
    :try_start_60
    monitor-exit v0
    :try_end_61
    .catchall {:try_start_60 .. :try_end_61} :catchall_5f

    goto :goto_63

    :goto_62
    throw p0

    :goto_63
    goto :goto_62
.end method


# virtual methods
.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 7

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->ぺぁあねじ:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->いいにぽつ:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->ぺふねづ〺:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_5a

    invoke-static {p0}, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Lづざかべべ/へぬ〴づぞ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_5a
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 2
    invoke-virtual {v0, p1, p2, p3, p4}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ておぞぞはね(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .registers 7

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    shr-int/lit8 v0, p1, 0x10

    if-eqz v0, :cond_30

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->びぐびあび(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v2, v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(I)V

    if-nez v1, :cond_1b

    return-void

    :cond_1b
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のね〱ばぁぢ(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_28

    goto :goto_2f

    :cond_28
    const v1, 0xffff

    and-int/2addr p1, v1

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->ぺづげぺが(IILandroid/content/Intent;)V

    :goto_2f
    return-void

    :cond_30
    sget v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->おぐぴう〸ず(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 9

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v0, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->〳ぜぞぜべっ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びぐびあび;Landroidx/fragment/app/Fragment;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_63

    const-string v1, "android:support:fragments"

    .line 2
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget-object v2, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    instance-of v3, v2, Lづざかべべ/のぷのちつ/ごづごきえ;

    if-eqz v3, :cond_5b

    iget-object v2, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->にぢ〱ぁな(Landroid/os/Parcelable;)V

    const-string v1, "android:support:next_request_index"

    .line 4
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_63

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    const-string v1, "android:support:request_indicies"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    const-string v2, "android:support:request_fragment_who"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_63

    if-eqz v2, :cond_63

    array-length v3, v1

    array-length v4, v2

    if-eq v3, v4, :cond_43

    goto :goto_63

    :cond_43
    new-instance v3, Lづざかべべ/づざかべべ/ぺぁあねじ;

    array-length v4, v1

    invoke-direct {v3, v4}, Lづざかべべ/づざかべべ/ぺぁあねじ;-><init>(I)V

    iput-object v3, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    const/4 v3, 0x0

    :goto_4c
    array-length v4, v1

    if-ge v3, v4, :cond_63

    iget-object v4, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    aget v5, v1, v3

    aget-object v6, v2, v3

    invoke-virtual {v4, v5, v6}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4c

    .line 5
    :cond_5b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_63
    :goto_63
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    if-nez v1, :cond_72

    new-instance v1, Lづざかべべ/づざかべべ/ぺぁあねじ;

    const/16 v2, 0xa

    .line 7
    invoke-direct {v1, v2}, Lづざかべべ/づざかべべ/ぺぁあねじ;-><init>(I)V

    .line 8
    iput-object v1, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    iput v0, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    :cond_72
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_CREATE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {p1, v0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 9
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉざぅち〻()V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .registers 5

    if-nez p1, :cond_16

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p2, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ざとぅぼこ〺(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    .line 2
    :cond_16
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .registers 6

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 2
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p1, p2, p3, p4}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_11

    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_11
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .registers 6

    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 5
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_12

    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_12
    return-object v0
.end method

.method public onDestroy()V
    .registers 3

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->は〲ぱなで()V

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_DESTROY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onLowMemory()V
    .registers 2

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ごづごきえ()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .registers 4

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p1, 0x1

    return p1

    :cond_8
    if-eqz p1, :cond_1a

    const/4 v0, 0x6

    if-eq p1, v0, :cond_f

    const/4 p1, 0x0

    return p1

    :cond_f
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇぬぎばつ(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 2
    :cond_1a
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->けときぜと(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ざっざへづ(Z)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .registers 2
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .registers 4

    if-eqz p1, :cond_3

    goto :goto_c

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->おかぷせ〱(Landroid/view/Menu;)V

    .line 2
    :goto_c
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPause()V
    .registers 3

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->いいにぽつ:Z

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v1, 0x3

    .line 2
    invoke-virtual {v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ながふずは(I)V

    .line 3
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_PAUSE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .registers 3

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇとしたべど(Z)V

    return-void
.end method

.method public onPostResume()V
    .registers 3

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_RESUME:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 2
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->でどあくず:Z

    iput-boolean v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぶでにく〼〳:Z

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ながふずは(I)V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .registers 4

    if-nez p1, :cond_13

    const/4 p1, 0x0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    .line 2
    iget-object p2, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget-object p2, p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p2, p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p2, p3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->げがぴうあだ(Landroid/view/Menu;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    .line 4
    :cond_13
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 4

    iget-object p2, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    shr-int/lit8 p1, p1, 0x10

    const p2, 0xffff

    and-int/2addr p1, p2

    if-eqz p1, :cond_28

    add-int/lit8 p1, p1, -0x1

    iget-object p2, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {p2, p1}, Lづざかべべ/づざかべべ/ぺぁあねじ;->びぐびあび(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object p3, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {p3, p1}, Lづざかべべ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(I)V

    if-nez p2, :cond_1f

    return-void

    :cond_1f
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のね〱ばぁぢ(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    :cond_28
    return-void
.end method

.method public onResume()V
    .registers 2

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->いいにぽつ:Z

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ばおぢでぎか()Z

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 6

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->ぉ〲なぱぽた()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v0

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->びぐびあび:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-static {v0, v1}, Landroidx/fragment/app/FragmentActivity;->ぇ〳〲〺すっ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->しぷげへが()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_27

    const-string v1, "android:support:fragments"

    .line 4
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_27
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result v0

    if-lez v0, :cond_6e

    iget v0, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    const-string v1, "android:support:next_request_index"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result v0

    new-array v0, v0, [I

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v1}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_47
    iget-object v3, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v3}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result v3

    if-ge v2, v3, :cond_64

    iget-object v3, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v3, v2}, Lづざかべべ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ(I)I

    move-result v3

    aput v3, v0, v2

    iget-object v3, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v3, v2}, Lづざかべべ/づざかべべ/ぺぁあねじ;->いいにぽつ(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_47

    :cond_64
    const-string v2, "android:support:request_indicies"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "android:support:request_fragment_who"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_6e
    return-void
.end method

.method public onStart()V
    .registers 4

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->ぺふねづ〺:Z

    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->ぺぁあねじ:Z

    if-nez v1, :cond_1b

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->ぺぁあねじ:Z

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 2
    iput-boolean v0, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->でどあくず:Z

    iput-boolean v0, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぶでにく〼〳:Z

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ながふずは(I)V

    .line 3
    :cond_1b
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 4
    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ばおぢでぎか()Z

    .line 5
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v2, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_START:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v1, v2}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 6
    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 7
    iput-boolean v0, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->でどあくず:Z

    iput-boolean v0, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぶでにく〼〳:Z

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ながふずは(I)V

    return-void
.end method

.method public onStateNotSaved()V
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ()V

    return-void
.end method

.method public onStop()V
    .registers 4

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->ぺふねづ〺:Z

    .line 1
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->ぉ〲なぱぽた()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v1

    sget-object v2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->びぐびあび:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-static {v1, v2}, Landroidx/fragment/app/FragmentActivity;->ぇ〳〲〺すっ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 2
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v1, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 4
    iput-boolean v0, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぶでにく〼〳:Z

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ながふずは(I)V

    .line 5
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .registers 4
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    iget-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->のぷのちつ:Z

    if-nez v0, :cond_a

    const/4 v0, -0x1

    if-eq p2, v0, :cond_a

    invoke-static {p2}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    :cond_a
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .registers 5
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    iget-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->のぷのちつ:Z

    if-nez v0, :cond_a

    const/4 v0, -0x1

    if-eq p2, v0, :cond_a

    invoke-static {p2}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    :cond_a
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .registers 8
    .param p1    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    invoke-static {p2}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    :cond_6
    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .registers 9
    .param p1    # Landroid/content/IntentSender;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    invoke-static {p2}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    :cond_6
    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public ぉ〲なぱぽた()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;
    .registers 2

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ぁごぐすすぃ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    return-object v0
.end method

.method public なぶひせが()V
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public びえぁぜい()V
    .registers 1

    return-void
.end method

.method public final びぐびあび(I)V
    .registers 3

    iget-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->てぜきぽく:Z

    if-nez v0, :cond_a

    const/4 v0, -0x1

    if-eq p1, v0, :cond_a

    invoke-static {p1}, Landroidx/fragment/app/FragmentActivity;->〻ぞまぎな〻(I)V

    :cond_a
    return-void
.end method

.method public final ぶでにく〼〳(Landroidx/fragment/app/Fragment;)I
    .registers 6

    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぺぁあねじ()I

    move-result v0

    const v1, 0xfffe

    if-ge v0, v1, :cond_39

    :goto_b
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    iget v2, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    .line 1
    iget-boolean v3, v0, Lづざかべべ/づざかべべ/ぺぁあねじ;->〺つふすそ:Z

    if-eqz v3, :cond_16

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ()V

    :cond_16
    iget-object v3, v0, Lづざかべべ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ:[I

    iget v0, v0, Lづざかべべ/づざかべべ/ぺぁあねじ;->づざかべべ:I

    invoke-static {v3, v0, v2}, Lづざかべべ/づざかべべ/びぐびあび;->げつ〴ぬぐ([III)I

    move-result v0

    if-ltz v0, :cond_28

    .line 2
    iget v0, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    add-int/lit8 v0, v0, 0x1

    rem-int/2addr v0, v1

    iput v0, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    goto :goto_b

    :cond_28
    iget v0, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    iget-object v2, p0, Landroidx/fragment/app/FragmentActivity;->おぐぴう〸ず:Lづざかべべ/づざかべべ/ぺぁあねじ;

    iget-object p1, p1, Landroidx/fragment/app/Fragment;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v2, v0, p1}, Lづざかべべ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ(ILjava/lang/Object;)V

    iget p1, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    add-int/lit8 p1, p1, 0x1

    rem-int/2addr p1, v1

    iput p1, p0, Landroidx/fragment/app/FragmentActivity;->へぬ〴づぞ:I

    return v0

    :cond_39
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Too many pending Fragment activity results."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_42

    :goto_41
    throw p1

    :goto_42
    goto :goto_41
.end method
