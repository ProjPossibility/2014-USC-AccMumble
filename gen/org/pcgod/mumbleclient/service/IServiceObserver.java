/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\manas\\workspace\\MumbleForBlind\\src\\org\\pcgod\\mumbleclient\\service\\IServiceObserver.aidl
 */
package org.pcgod.mumbleclient.service;
public interface IServiceObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.pcgod.mumbleclient.service.IServiceObserver
{
private static final java.lang.String DESCRIPTOR = "org.pcgod.mumbleclient.service.IServiceObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.pcgod.mumbleclient.service.IServiceObserver interface,
 * generating a proxy if needed.
 */
public static org.pcgod.mumbleclient.service.IServiceObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.pcgod.mumbleclient.service.IServiceObserver))) {
return ((org.pcgod.mumbleclient.service.IServiceObserver)iin);
}
return new org.pcgod.mumbleclient.service.IServiceObserver.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onChannelAdded:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.Channel _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.Channel.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onChannelAdded(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onChannelRemoved:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.Channel _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.Channel.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onChannelRemoved(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onChannelUpdated:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.Channel _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.Channel.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onChannelUpdated(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onCurrentChannelChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onCurrentChannelChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_onCurrentUserUpdated:
{
data.enforceInterface(DESCRIPTOR);
this.onCurrentUserUpdated();
reply.writeNoException();
return true;
}
case TRANSACTION_onUserAdded:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.User _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.User.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onUserAdded(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onUserRemoved:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.User _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.User.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onUserRemoved(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onUserUpdated:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.User _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.User.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onUserUpdated(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.Message _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.Message.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onMessageReceived(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onMessageSent:
{
data.enforceInterface(DESCRIPTOR);
org.pcgod.mumbleclient.service.model.Message _arg0;
if ((0!=data.readInt())) {
_arg0 = org.pcgod.mumbleclient.service.model.Message.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onMessageSent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onConnectionStateChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onConnectionStateChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.pcgod.mumbleclient.service.IServiceObserver
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void onChannelAdded(org.pcgod.mumbleclient.service.model.Channel channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((channel!=null)) {
_data.writeInt(1);
channel.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onChannelAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onChannelRemoved(org.pcgod.mumbleclient.service.model.Channel channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((channel!=null)) {
_data.writeInt(1);
channel.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onChannelRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onChannelUpdated(org.pcgod.mumbleclient.service.model.Channel channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((channel!=null)) {
_data.writeInt(1);
channel.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onChannelUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCurrentChannelChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onCurrentChannelChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onCurrentUserUpdated() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onCurrentUserUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onUserAdded(org.pcgod.mumbleclient.service.model.User user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onUserAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onUserRemoved(org.pcgod.mumbleclient.service.model.User user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onUserRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onUserUpdated(org.pcgod.mumbleclient.service.model.User user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onUserUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onMessageReceived(org.pcgod.mumbleclient.service.model.Message msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMessageReceived, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onMessageSent(org.pcgod.mumbleclient.service.model.Message msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onMessageSent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
	 * Called when the connection state changes.
	 */
@Override public void onConnectionStateChanged(int state) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
mRemote.transact(Stub.TRANSACTION_onConnectionStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onChannelAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onChannelRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onChannelUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onCurrentChannelChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onCurrentUserUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onUserAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onUserRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onUserUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_onMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_onMessageSent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_onConnectionStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void onChannelAdded(org.pcgod.mumbleclient.service.model.Channel channel) throws android.os.RemoteException;
public void onChannelRemoved(org.pcgod.mumbleclient.service.model.Channel channel) throws android.os.RemoteException;
public void onChannelUpdated(org.pcgod.mumbleclient.service.model.Channel channel) throws android.os.RemoteException;
public void onCurrentChannelChanged() throws android.os.RemoteException;
public void onCurrentUserUpdated() throws android.os.RemoteException;
public void onUserAdded(org.pcgod.mumbleclient.service.model.User user) throws android.os.RemoteException;
public void onUserRemoved(org.pcgod.mumbleclient.service.model.User user) throws android.os.RemoteException;
public void onUserUpdated(org.pcgod.mumbleclient.service.model.User user) throws android.os.RemoteException;
public void onMessageReceived(org.pcgod.mumbleclient.service.model.Message msg) throws android.os.RemoteException;
public void onMessageSent(org.pcgod.mumbleclient.service.model.Message msg) throws android.os.RemoteException;
/**
	 * Called when the connection state changes.
	 */
public void onConnectionStateChanged(int state) throws android.os.RemoteException;
}
