.class public final Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Landroid/media/session/MediaSessionManager$RemoteUserInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    invoke-direct {v0, p1, p2, p3}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    iput-object v0, p0, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;->げつ〴ぬぐ:Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-ne p0, p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    instance-of v0, p1, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;

    if-nez v0, :cond_a

    const/4 p1, 0x0

    return p1

    :cond_a
    check-cast p1, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;->げつ〴ぬぐ:Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    iget-object p1, p1, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;->げつ〴ぬぐ:Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    invoke-virtual {v0, p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/〻ぞまぎな〻;->げつ〴ぬぐ:Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ごまけがぢは([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
