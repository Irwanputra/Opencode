.class public Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/びぐびあび;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static げつ〴ぬぐ(Ljava/io/File;)Z
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_c

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    goto :goto_d

    :cond_c
    const/4 v2, 0x0

    :goto_d
    if-nez v2, :cond_10

    return v1

    .line 2
    :cond_10
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0

    :cond_1b
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-nez v2, :cond_22

    return v0

    :cond_22
    :goto_22
    array-length v3, v2

    if-ge v0, v3, :cond_2f

    aget-object v3, v2, v0

    invoke-static {v3}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/びぐびあび;->げつ〴ぬぐ(Ljava/io/File;)Z

    move-result v3

    or-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_22

    :cond_2f
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    or-int/2addr p0, v1

    return p0
.end method
